package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmformulasww", "/app.tmformulasww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmformulasww extends GXWebObjectStub
{
   public tmformulasww( )
   {
   }

   public tmformulasww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmformulasww.class ));
   }

   public tmformulasww( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmformulasww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmformulasww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento de Formulas";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

