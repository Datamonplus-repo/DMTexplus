package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajosexternos.trabajoexterno_fase_n", "/app.trabajosexternos.trabajoexterno_fase_n"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trabajoexterno_fase_n extends GXWebObjectStub
{
   public trabajoexterno_fase_n( )
   {
   }

   public trabajoexterno_fase_n( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trabajoexterno_fase_n.class ));
   }

   public trabajoexterno_fase_n( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trabajoexterno_fase_n_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trabajoexterno_fase_n_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Tabla BARFAS";
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

