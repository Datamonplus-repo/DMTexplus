package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpfasesww", "/app.nwdpfasesww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpfasesww extends GXWebObjectStub
{
   public nwdpfasesww( )
   {
   }

   public nwdpfasesww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpfasesww.class ));
   }

   public nwdpfasesww( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpfasesww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpfasesww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Nw DPFases";
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

