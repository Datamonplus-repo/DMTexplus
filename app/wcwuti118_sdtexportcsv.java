package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwuti118_sdtexportcsv", "/app.wcwuti118_sdtexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwuti118_sdtexportcsv extends GXWebObjectStub
{
   public wcwuti118_sdtexportcsv( )
   {
   }

   public wcwuti118_sdtexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwuti118_sdtexportcsv.class ));
   }

   public wcwuti118_sdtexportcsv( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwuti118_sdtexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwuti118_sdtexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCWUti118_SDTExport CSV";
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

