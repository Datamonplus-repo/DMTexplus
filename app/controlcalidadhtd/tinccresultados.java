package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.tinccresultados", "/app.controlcalidadhtd.tinccresultados"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tinccresultados extends GXWebObjectStub
{
   public tinccresultados( )
   {
   }

   public tinccresultados( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tinccresultados.class ));
   }

   public tinccresultados( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tinccresultados_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tinccresultados_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "INCCResultados";
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

