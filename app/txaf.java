package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.txaf", "/app.txaf"})
@jakarta.servlet.annotation.MultipartConfig
public final  class txaf extends GXWebObjectStub
{
   public txaf( )
   {
   }

   public txaf( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( txaf.class ));
   }

   public txaf( int remoteHandle ,
                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new txaf_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new txaf_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "INT_REMISIONES";
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

