package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpfasesview", "/app.nwdpfasesview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpfasesview extends GXWebObjectStub
{
   public nwdpfasesview( )
   {
   }

   public nwdpfasesview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpfasesview.class ));
   }

   public nwdpfasesview( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpfasesview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpfasesview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Nw DPFases View";
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

