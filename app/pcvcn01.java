package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pcvcn01", "/app.pcvcn01"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pcvcn01 extends GXWebObjectStub
{
   public pcvcn01( )
   {
   }

   public pcvcn01( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pcvcn01.class ));
   }

   public pcvcn01( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pcvcn01_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pcvcn01_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe de OSs";
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

