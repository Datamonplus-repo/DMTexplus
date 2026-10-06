package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajosexternos.trabajoexterno_anulacion", "/app.trabajosexternos.trabajoexterno_anulacion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trabajoexterno_anulacion extends GXWebObjectStub
{
   public trabajoexterno_anulacion( )
   {
   }

   public trabajoexterno_anulacion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trabajoexterno_anulacion.class ));
   }

   public trabajoexterno_anulacion( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trabajoexterno_anulacion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trabajoexterno_anulacion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Preparo XML AT Trabajo Externo";
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

