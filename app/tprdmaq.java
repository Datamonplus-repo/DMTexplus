package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprdmaq", "/app.tprdmaq"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprdmaq extends GXWebObjectStub
{
   public tprdmaq( )
   {
   }

   public tprdmaq( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprdmaq.class ));
   }

   public tprdmaq( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprdmaq_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprdmaq_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRODUCTOS P/MAQUINA";
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

