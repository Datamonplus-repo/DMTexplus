package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.devolucionalmacentejidocrudosindetallewwexportcsv", "/app.devolucionalmacentejidocrudosindetallewwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class devolucionalmacentejidocrudosindetallewwexportcsv extends GXWebObjectStub
{
   public devolucionalmacentejidocrudosindetallewwexportcsv( )
   {
   }

   public devolucionalmacentejidocrudosindetallewwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( devolucionalmacentejidocrudosindetallewwexportcsv.class ));
   }

   public devolucionalmacentejidocrudosindetallewwexportcsv( int remoteHandle ,
                                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new devolucionalmacentejidocrudosindetallewwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new devolucionalmacentejidocrudosindetallewwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Devolucion Almacen Tejido Crudosindetalle WWExport CSV";
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

