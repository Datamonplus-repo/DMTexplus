package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.promptproductosvariables", "/app.formulaciontinte.promptproductosvariables"})
@jakarta.servlet.annotation.MultipartConfig
public final  class promptproductosvariables extends GXWebObjectStub
{
   public promptproductosvariables( )
   {
   }

   public promptproductosvariables( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( promptproductosvariables.class ));
   }

   public promptproductosvariables( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new promptproductosvariables_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new promptproductosvariables_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Productos Variables (#)";
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

