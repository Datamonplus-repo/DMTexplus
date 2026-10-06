package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tterminwwexportreport", "/app.tterminwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tterminwwexportreport extends GXWebObjectStub
{
   public tterminwwexportreport( )
   {
   }

   public tterminwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tterminwwexportreport.class ));
   }

   public tterminwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tterminwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tterminwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTERMINWWExport Report";
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

