package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tccalm", "/app.tccalm"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tccalm extends GXWebObjectStub
{
   public tccalm( )
   {
   }

   public tccalm( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tccalm.class ));
   }

   public tccalm( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tccalm_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tccalm_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CUENTA CORRIENTE ALMACENES";
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

