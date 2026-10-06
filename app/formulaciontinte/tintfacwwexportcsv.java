package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tintfacwwexportcsv", "/app.formulaciontinte.tintfacwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tintfacwwexportcsv extends GXWebObjectStub
{
   public tintfacwwexportcsv( )
   {
   }

   public tintfacwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tintfacwwexportcsv.class ));
   }

   public tintfacwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tintfacwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tintfacwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TINTFACWWExport CSV";
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

