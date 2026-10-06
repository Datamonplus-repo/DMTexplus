package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcolpre", "/app.tcolpre"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcolpre extends GXWebObjectStub
{
   public tcolpre( )
   {
   }

   public tcolpre( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcolpre.class ));
   }

   public tcolpre( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcolpre_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcolpre_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRECIO POR COLOR";
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

