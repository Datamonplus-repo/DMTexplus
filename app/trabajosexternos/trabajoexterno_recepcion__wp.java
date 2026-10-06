package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajosexternos.trabajoexterno_recepcion__wp", "/app.trabajosexternos.trabajoexterno_recepcion__wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trabajoexterno_recepcion__wp extends GXWebObjectStub
{
   public trabajoexterno_recepcion__wp( )
   {
   }

   public trabajoexterno_recepcion__wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trabajoexterno_recepcion__wp.class ));
   }

   public trabajoexterno_recepcion__wp( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trabajoexterno_recepcion__wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trabajoexterno_recepcion__wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Trabajo Externo (Recepcion)";
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

