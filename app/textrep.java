package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.textrep", "/app.textrep"})
@jakarta.servlet.annotation.MultipartConfig
public final  class textrep extends GXWebObjectStub
{
   public textrep( )
   {
   }

   public textrep( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( textrep.class ));
   }

   public textrep( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new textrep_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new textrep_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "NO SE UTILIZA, RECEPCION ORDENES TRABAJOS EXT";
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

