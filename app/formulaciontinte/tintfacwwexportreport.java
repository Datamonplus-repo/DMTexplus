package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tintfacwwexportreport", "/app.formulaciontinte.tintfacwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tintfacwwexportreport extends GXWebObjectStub
{
   public tintfacwwexportreport( )
   {
   }

   public tintfacwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tintfacwwexportreport.class ));
   }

   public tintfacwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tintfacwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tintfacwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TINTFACWWExport Report";
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

