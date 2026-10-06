package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.devolucionalmacentejidocrudosindetallewwexportreport", "/app.devolucionalmacentejidocrudosindetallewwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class devolucionalmacentejidocrudosindetallewwexportreport extends GXWebObjectStub
{
   public devolucionalmacentejidocrudosindetallewwexportreport( )
   {
   }

   public devolucionalmacentejidocrudosindetallewwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( devolucionalmacentejidocrudosindetallewwexportreport.class ));
   }

   public devolucionalmacentejidocrudosindetallewwexportreport( int remoteHandle ,
                                                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new devolucionalmacentejidocrudosindetallewwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new devolucionalmacentejidocrudosindetallewwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Devolucion Almacen Tejido Crudosindetalle WWExport Report";
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

