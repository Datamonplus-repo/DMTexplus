package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wctbllhiprolistexportcsv", "/app.wctbllhiprolistexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wctbllhiprolistexportcsv extends GXWebObjectStub
{
   public wctbllhiprolistexportcsv( )
   {
   }

   public wctbllhiprolistexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wctbllhiprolistexportcsv.class ));
   }

   public wctbllhiprolistexportcsv( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wctbllhiprolistexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wctbllhiprolistexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCtbl Lhipro List Export CSV";
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

