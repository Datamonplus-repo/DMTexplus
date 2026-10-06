package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttproducprompt", "/app.ttproducprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttproducprompt extends GXWebObjectStub
{
   public ttproducprompt( )
   {
   }

   public ttproducprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttproducprompt.class ));
   }

   public ttproducprompt( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttproducprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttproducprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Mantenimiento de Productos Quimicos";
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

