package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcdupfasesexportcsv", "/app.wcdupfasesexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcdupfasesexportcsv extends GXWebObjectStub
{
   public wcdupfasesexportcsv( )
   {
   }

   public wcdupfasesexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcdupfasesexportcsv.class ));
   }

   public wcdupfasesexportcsv( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcdupfasesexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcdupfasesexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCDup Fases Export CSV";
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

