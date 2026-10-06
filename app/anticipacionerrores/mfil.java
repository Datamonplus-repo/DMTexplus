package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.anticipacionerrores.mfil", "/app.anticipacionerrores.mfil"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mfil extends GXWebObjectStub
{
   public mfil( )
   {
   }

   public mfil( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mfil.class ));
   }

   public mfil( int remoteHandle ,
                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mfil_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mfil_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MFil";
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

