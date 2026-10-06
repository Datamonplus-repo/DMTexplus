package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpdetallepiezas", "/app.nwdpdetallepiezas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpdetallepiezas extends GXWebObjectStub
{
   public nwdpdetallepiezas( )
   {
   }

   public nwdpdetallepiezas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpdetallepiezas.class ));
   }

   public nwdpdetallepiezas( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpdetallepiezas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpdetallepiezas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Nw DPDetalle Piezas";
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

