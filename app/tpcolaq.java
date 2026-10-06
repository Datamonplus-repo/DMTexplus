package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpcolaq", "/app.tpcolaq"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpcolaq extends GXWebObjectStub
{
   public tpcolaq( )
   {
   }

   public tpcolaq( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpcolaq.class ));
   }

   public tpcolaq( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpcolaq_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpcolaq_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRECIO POR COLOR-ACABADO Q";
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

