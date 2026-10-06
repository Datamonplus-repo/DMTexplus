package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.calprd_trnview", "/app.calprd_trnview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class calprd_trnview extends GXWebObjectStub
{
   public calprd_trnview( )
   {
   }

   public calprd_trnview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( calprd_trnview.class ));
   }

   public calprd_trnview( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new calprd_trnview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new calprd_trnview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Calprd_TRNView";
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

