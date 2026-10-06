package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.modificacionloteproducto_wp", "/app.stocksquimicos.modificacionloteproducto_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class modificacionloteproducto_wp extends GXWebObjectStub
{
   public modificacionloteproducto_wp( )
   {
   }

   public modificacionloteproducto_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( modificacionloteproducto_wp.class ));
   }

   public modificacionloteproducto_wp( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new modificacionloteproducto_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new modificacionloteproducto_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Modificacion Lote Producto";
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

