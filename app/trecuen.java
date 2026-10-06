package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trecuen", "/app.trecuen"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trecuen extends GXWebObjectStub
{
   public trecuen( )
   {
   }

   public trecuen( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trecuen.class ));
   }

   public trecuen( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trecuen_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trecuen_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "RECUENTOS";
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

