package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tplamaq", "/app.tplamaq"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tplamaq extends GXWebObjectStub
{
   public tplamaq( )
   {
   }

   public tplamaq( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tplamaq.class ));
   }

   public tplamaq( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tplamaq_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tplamaq_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Maquinas";
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

