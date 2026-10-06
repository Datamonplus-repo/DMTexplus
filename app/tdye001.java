package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdye001", "/app.tdye001"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdye001 extends GXWebObjectStub
{
   public tdye001( )
   {
   }

   public tdye001( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdye001.class ));
   }

   public tdye001( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdye001_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdye001_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DYELOTS";
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

