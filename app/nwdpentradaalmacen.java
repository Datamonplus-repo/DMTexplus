package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpentradaalmacen", "/app.nwdpentradaalmacen"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpentradaalmacen extends GXWebObjectStub
{
   public nwdpentradaalmacen( )
   {
   }

   public nwdpentradaalmacen( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpentradaalmacen.class ));
   }

   public nwdpentradaalmacen( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpentradaalmacen_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpentradaalmacen_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Nw DPEntrada Almacen";
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

