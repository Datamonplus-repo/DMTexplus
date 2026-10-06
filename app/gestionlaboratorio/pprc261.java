package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.pprc261", "/app.gestionlaboratorio.pprc261"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pprc261 extends GXWebObjectStub
{
   public pprc261( )
   {
   }

   public pprc261( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pprc261.class ));
   }

   public pprc261( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pprc261_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pprc261_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lab Dip Detalle Costes";
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

