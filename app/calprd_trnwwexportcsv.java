package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.calprd_trnwwexportcsv", "/app.calprd_trnwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class calprd_trnwwexportcsv extends GXWebObjectStub
{
   public calprd_trnwwexportcsv( )
   {
   }

   public calprd_trnwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( calprd_trnwwexportcsv.class ));
   }

   public calprd_trnwwexportcsv( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new calprd_trnwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new calprd_trnwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Calprd_TRNWWExport CSV";
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

