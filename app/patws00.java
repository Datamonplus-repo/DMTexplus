package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.patws00", "/app.patws00"})
@jakarta.servlet.annotation.MultipartConfig
public final  class patws00 extends GXWebObjectStub
{
   public patws00( )
   {
   }

   public patws00( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( patws00.class ));
   }

   public patws00( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new patws00_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new patws00_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LECTURA FICHERO RESPUESTA GR";
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

