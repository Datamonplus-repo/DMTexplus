package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpre001", "/app.tpre001"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpre001 extends GXWebObjectStub
{
   public tpre001( )
   {
   }

   public tpre001( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpre001.class ));
   }

   public tpre001( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpre001_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpre001_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRECIO GLOBAL COLOR";
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

