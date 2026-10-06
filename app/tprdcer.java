package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprdcer", "/app.tprdcer"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprdcer extends GXWebObjectStub
{
   public tprdcer( )
   {
   }

   public tprdcer( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprdcer.class ));
   }

   public tprdcer( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprdcer_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprdcer_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRODUCTOS CON CERTIFICACIONES";
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

