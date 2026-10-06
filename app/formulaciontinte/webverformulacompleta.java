package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.webverformulacompleta", "/app.formulaciontinte.webverformulacompleta"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webverformulacompleta extends GXWebObjectStub
{
   public webverformulacompleta( )
   {
   }

   public webverformulacompleta( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webverformulacompleta.class ));
   }

   public webverformulacompleta( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webverformulacompleta_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webverformulacompleta_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Simulacion Formula";
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

