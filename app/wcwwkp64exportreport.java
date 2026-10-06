package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwwkp64exportreport", "/app.wcwwkp64exportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwwkp64exportreport extends GXWebObjectStub
{
   public wcwwkp64exportreport( )
   {
   }

   public wcwwkp64exportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwwkp64exportreport.class ));
   }

   public wcwwkp64exportreport( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwwkp64exportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwwkp64exportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCwwkp64 Export Report";
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

