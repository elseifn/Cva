package cn.misection.cvac.ast.method;

import cn.misection.cvac.ast.decl.AbstractDeclaration;
import cn.misection.cvac.ast.expr.AbstractExpression;
import cn.misection.cvac.ast.statement.AbstractStatement;
import cn.misection.cvac.ast.type.AbstractType;

import java.util.List;

/**
 * @author Military Intelligence 6 root
 * @version 1.0.0
 * @ClassName CvaMethod
 * @Description TODO
 * @CreateTime 2021年02月14日 20:02:00
 */
public final class CvaMethod extends AbstractMethod
{
    private String name;

    private AbstractType retType;

    private AbstractExpression retExpr;

    private List<AbstractDeclaration> argumentList;

    private List<AbstractDeclaration> localVarList;

    private List<AbstractStatement> statementList;

    public CvaMethod(String name,
                     AbstractType retType,
                     AbstractExpression retExpr,
                     List<AbstractDeclaration> argumentList,
                     List<AbstractDeclaration> localVarList,
                     List<AbstractStatement> statementList)
    {
        this.name = name;
        this.retType = retType;
        this.retExpr = retExpr;
        this.argumentList = argumentList;
        this.localVarList = localVarList;
        this.statementList = statementList;
    }

    @Override
    public String name()
    {
        return name;
    }

    @Override
    public AbstractType getRetType()
    {
        return retType;
    }

    @Override
    public AbstractExpression getRetExpr()
    {
        return retExpr;
    }

    @Override
    public List<AbstractDeclaration> getArgumentList()
    {
        return argumentList;
    }

    @Override
    public List<AbstractDeclaration> getLocalVarList()
    {
        return localVarList;
    }

    @Override
    public List<AbstractStatement> getStatementList()
    {
        return statementList;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setRetType(AbstractType retType)
    {
        this.retType = retType;
    }

    public void setRetExpr(AbstractExpression retExpr)
    {
        this.retExpr = retExpr;
    }

    public void setArgumentList(List<AbstractDeclaration> argumentList)
    {
        this.argumentList = argumentList;
    }

    public void setLocalVarList(List<AbstractDeclaration> localVarList)
    {
        this.localVarList = localVarList;
    }

    public void setStatementList(List<AbstractStatement> statementList)
    {
        this.statementList = statementList;
    }
}
