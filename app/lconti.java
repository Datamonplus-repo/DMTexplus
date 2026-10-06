package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.lconti", "/app.lconti"})
@jakarta.servlet.annotation.MultipartConfig
public final  class lconti extends GXWebObjectStub
{
   public lconti( )
   {
   }

   public lconti( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( lconti.class ));
   }

   public lconti( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new lconti_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new lconti_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LCONTI";
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

