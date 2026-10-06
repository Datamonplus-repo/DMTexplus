package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.masinformacion", "/app.masinformacion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class masinformacion extends GXWebObjectStub
{
   public masinformacion( )
   {
   }

   public masinformacion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( masinformacion.class ));
   }

   public masinformacion( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new masinformacion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new masinformacion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mas Informacion";
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

