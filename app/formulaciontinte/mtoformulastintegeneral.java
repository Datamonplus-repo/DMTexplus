package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.mtoformulastintegeneral", "/app.formulaciontinte.mtoformulastintegeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mtoformulastintegeneral extends GXWebObjectStub
{
   public mtoformulastintegeneral( )
   {
   }

   public mtoformulastintegeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mtoformulastintegeneral.class ));
   }

   public mtoformulastintegeneral( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mtoformulastintegeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mtoformulastintegeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mto Formulas Tinte General";
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

