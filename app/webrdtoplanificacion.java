package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webrdtoplanificacion", "/app.webrdtoplanificacion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webrdtoplanificacion extends GXWebObjectStub
{
   public webrdtoplanificacion( )
   {
   }

   public webrdtoplanificacion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webrdtoplanificacion.class ));
   }

   public webrdtoplanificacion( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webrdtoplanificacion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webrdtoplanificacion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Programacion Tinte Validacion NE";
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

