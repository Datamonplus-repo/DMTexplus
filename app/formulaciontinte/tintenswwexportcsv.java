package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tintenswwexportcsv", "/app.formulaciontinte.tintenswwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tintenswwexportcsv extends GXWebObjectStub
{
   public tintenswwexportcsv( )
   {
   }

   public tintenswwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tintenswwexportcsv.class ));
   }

   public tintenswwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tintenswwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tintenswwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TINTENSWWExport CSV";
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

