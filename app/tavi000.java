package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tavi000", "/app.tavi000"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tavi000 extends GXWebObjectStub
{
   public tavi000( )
   {
   }

   public tavi000( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tavi000.class ));
   }

   public tavi000( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tavi000_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tavi000_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TABLA DE AVISOS VERSION II";
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

