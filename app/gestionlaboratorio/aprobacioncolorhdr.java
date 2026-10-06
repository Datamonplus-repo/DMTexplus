package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.aprobacioncolorhdr", "/app.gestionlaboratorio.aprobacioncolorhdr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class aprobacioncolorhdr extends GXWebObjectStub
{
   public aprobacioncolorhdr( )
   {
   }

   public aprobacioncolorhdr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( aprobacioncolorhdr.class ));
   }

   public aprobacioncolorhdr( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new aprobacioncolorhdr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new aprobacioncolorhdr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Aprobacion Color Hdr";
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

