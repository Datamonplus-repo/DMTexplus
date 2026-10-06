package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdevcruview", "/app.tdevcruview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdevcruview extends GXWebObjectStub
{
   public tdevcruview( )
   {
   }

   public tdevcruview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdevcruview.class ));
   }

   public tdevcruview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdevcruview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdevcruview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TDEVCRUView";
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

