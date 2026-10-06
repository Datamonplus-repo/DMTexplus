package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.activarhdr_wc", "/app.activarhdr_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class activarhdr_wc extends GXWebObjectStub
{
   public activarhdr_wc( )
   {
   }

   public activarhdr_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( activarhdr_wc.class ));
   }

   public activarhdr_wc( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new activarhdr_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new activarhdr_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "HDRs Suspendidas";
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

