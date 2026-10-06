package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ccstkstccstks", "/app.ccstkstccstks"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ccstkstccstks extends GXWebObjectStub
{
   public ccstkstccstks( )
   {
   }

   public ccstkstccstks( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ccstkstccstks.class ));
   }

   public ccstkstccstks( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ccstkstccstks_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ccstkstccstks_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CCSTKSTCCSTKS";
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

