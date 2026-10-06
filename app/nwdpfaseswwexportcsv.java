package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpfaseswwexportcsv", "/app.nwdpfaseswwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpfaseswwexportcsv extends GXWebObjectStub
{
   public nwdpfaseswwexportcsv( )
   {
   }

   public nwdpfaseswwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpfaseswwexportcsv.class ));
   }

   public nwdpfaseswwexportcsv( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpfaseswwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpfaseswwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Nw DPFases WWExport CSV";
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

