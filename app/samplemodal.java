package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.samplemodal", "/app.samplemodal"})
@jakarta.servlet.annotation.MultipartConfig
public final  class samplemodal extends GXWebObjectStub
{
   public samplemodal( )
   {
   }

   public samplemodal( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( samplemodal.class ));
   }

   public samplemodal( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new samplemodal_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new samplemodal_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Sample Modal";
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

