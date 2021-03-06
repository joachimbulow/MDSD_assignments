/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.generator;

import com.google.common.collect.Iterators;
import dk.sdu.mmmi.mdsd.math.Add;
import dk.sdu.mmmi.mdsd.math.Divide;
import dk.sdu.mmmi.mdsd.math.Expression;
import dk.sdu.mmmi.mdsd.math.MathExp;
import dk.sdu.mmmi.mdsd.math.Multiply;
import dk.sdu.mmmi.mdsd.math.Subtract;
import dk.sdu.mmmi.mdsd.math.Variables;
import dk.sdu.mmmi.mdsd.math.num;
import dk.sdu.mmmi.mdsd.math.varUse;
import dk.sdu.mmmi.mdsd.math.variableInit;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MathGenerator extends AbstractGenerator {
  private static Map<String, Integer> variables = new HashMap<String, Integer>();
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final TreeIterator<EObject> debug = resource.getAllContents();
    final Variables allVariables = Iterators.<Variables>filter(resource.getAllContents(), Variables.class).next();
    final Map<String, Integer> result = MathGenerator.compute(allVariables);
    this.displayPanel(result);
  }
  
  public static Map<String, Integer> compute(final Variables v) {
    EList<MathExp> _variables = v.getVariables();
    for (final MathExp mathExp : _variables) {
      {
        final int i = MathGenerator.computeExp(mathExp.getExp(), MathGenerator.variables);
        MathGenerator.variables.put(mathExp.getName(), Integer.valueOf(i));
      }
    }
    return MathGenerator.variables;
  }
  
  public static int computeExp(final Expression exp, final Map<String, Integer> vars) {
    Integer _switchResult = null;
    boolean _matched = false;
    if (exp instanceof Add) {
      _matched=true;
      int _computeExp = MathGenerator.computeExp(((Add)exp).getLeft(), vars);
      int _computeExp_1 = MathGenerator.computeExp(((Add)exp).getRight(), vars);
      _switchResult = Integer.valueOf((_computeExp + _computeExp_1));
    }
    if (!_matched) {
      if (exp instanceof Subtract) {
        _matched=true;
        int _computeExp = MathGenerator.computeExp(((Subtract)exp).getLeft(), vars);
        int _computeExp_1 = MathGenerator.computeExp(((Subtract)exp).getRight(), vars);
        _switchResult = Integer.valueOf((_computeExp - _computeExp_1));
      }
    }
    if (!_matched) {
      if (exp instanceof Multiply) {
        _matched=true;
        int _computeExp = MathGenerator.computeExp(((Multiply)exp).getLeft(), vars);
        int _computeExp_1 = MathGenerator.computeExp(((Multiply)exp).getRight(), vars);
        _switchResult = Integer.valueOf((_computeExp * _computeExp_1));
      }
    }
    if (!_matched) {
      if (exp instanceof Divide) {
        _matched=true;
        int _computeExp = MathGenerator.computeExp(((Divide)exp).getLeft(), vars);
        int _computeExp_1 = MathGenerator.computeExp(((Divide)exp).getRight(), vars);
        _switchResult = Integer.valueOf((_computeExp / _computeExp_1));
      }
    }
    if (!_matched) {
      if (exp instanceof num) {
        _matched=true;
        _switchResult = Integer.valueOf(((num)exp).getValue());
      }
    }
    if (!_matched) {
      if (exp instanceof varUse) {
        _matched=true;
        _switchResult = vars.get(((varUse)exp).getInExp().getName());
      }
    }
    if (!_matched) {
      if (exp instanceof variableInit) {
        _matched=true;
        _switchResult = Integer.valueOf(MathGenerator.computeExp(((variableInit)exp).getStatement(), MathGenerator.appendToMap(vars, ((variableInit)exp).getName(), MathGenerator.computeExp(((variableInit)exp).getInit(), vars))));
      }
    }
    if (!_matched) {
      _switchResult = Integer.valueOf((-999999));
    }
    return (_switchResult).intValue();
  }
  
  public static Map<String, Integer> appendToMap(final Map<String, Integer> map, final String name, final int value) {
    final HashMap<String, Integer> temp = new HashMap<String, Integer>(map);
    temp.put(name, Integer.valueOf(value));
    return temp;
  }
  
  public void displayPanel(final Map<String, Integer> result) {
    String resultString = "";
    Set<Map.Entry<String, Integer>> _entrySet = result.entrySet();
    for (final Map.Entry<String, Integer> entry : _entrySet) {
      String _resultString = resultString;
      String _key = entry.getKey();
      String _plus = ("var " + _key);
      String _plus_1 = (_plus + " = ");
      Integer _value = entry.getValue();
      String _plus_2 = (_plus_1 + _value);
      String _plus_3 = (_plus_2 + "\n");
      resultString = (_resultString + _plus_3);
    }
    JOptionPane.showMessageDialog(null, resultString, "Math Language", JOptionPane.INFORMATION_MESSAGE);
  }
}
