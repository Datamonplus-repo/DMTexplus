package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tnprovprdwwexportcsv", "/app.tnprovprdwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnprovprdwwexportcsv extends GXWebObjectStub
{
   public tnprovprdwwexportcsv( )
   {
   }

   public tnprovprdwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnprovprdwwexportcsv.class ));
   }

   public tnprovprdwwexportcsv( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnprovprdwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnprovprdwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tn PROVPRDWWExport CSV";
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

