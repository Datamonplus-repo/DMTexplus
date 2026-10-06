package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tubicad", "/app.tubicad"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tubicad extends GXWebObjectStub
{
   public tubicad( )
   {
   }

   public tubicad( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tubicad.class ));
   }

   public tubicad( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tubicad_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tubicad_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CONTROL OT/OE EN UBICACIONES";
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

